--drop TRIGGER IF EXISTS "updateDeltaOnInserOrUpdateTrigger" ON txs;
CREATE OR REPLACE FUNCTION deltaCalc() RETURNS trigger
    LANGUAGE plpgsql AS
$$BEGIN
    NEW.delta_price := NEW.latest_price - OLD.latest_price;
    RETURN NEW;
END;
$$;

CREATE TRIGGER deltacalc
    BEFORE INSERT OR UPDATE or DELETE
    ON stock
    FOR EACH ROW
EXECUTE PROCEDURE deltaCalc();


-- trigger stock_audit_trig ger
CREATE TRIGGER stock_audit_trigger
    AFTER INSERT OR UPDATE
    ON stock_audit_log
    FOR EACH ROW
EXECUTE FUNCTION stock_audit_trigger_func();

--stock_audit_trigger_func
CREATE OR REPLACE FUNCTION stock_audit_trigger_func()
    RETURNS trigger AS
$body$
BEGIN
    if (TG_OP = 'INSERT') THEN
        INSERT INTO stock_audit_log (id,
                                     old_row_data,
                                     new_row_data,
                                     dml_type,
                                     dml_timestamp,
                                     symbol)
        VALUES (NEW.id,
                null,
                to_jsonb(NEW),
                TG_OP::dml_type,
                CURRENT_TIMESTAMP,
                NEW.symbol);
        RETURN NEW;

    elseif (TG_OP = 'UPDATE') then
        INSERT INTO stock_audit_log (id,
                                     old_row_data,
                                     new_row_data,
                                     dml_type,
                                     dml_type,
                                     dml_timestamp,
                                     symbol)
        VALUES (NEW.id,
                to_jsonb(OLD),
                to_jsonb(NEW),
                'UPDATE',
                CURRENT_TIMESTAMP,
                NEW.symbol);
        RETURN NEW;
    end if;
    RETURN NULL;
END;
$body$
    LANGUAGE plpgsql;
