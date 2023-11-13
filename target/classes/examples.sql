SELECT MAX(latest_price) as Max_latest_price
FROM stock;

SELECT symbol, AVG(latest_price) as Averege_latest_price
FROM stock
GROUP BY symbol;

SELECT symbol, SUM(latest_price) as Total_latest_price
FROM stock
GROUP BY symbol;

SELECT symbol, COUNT(*) AS Number_of_symbols
FROM stock
GROUP BY symbol;

SELECT symbol, COUNT(*) AS Number_of_symbols
FROM stock
GROUP BY symbol
HAVING symbol = 'A';

SELECT symbol, SUM(latest_price + previous_volume) AS Cumulative_price_all_symbols
FROM stock
GROUP BY symbol;


