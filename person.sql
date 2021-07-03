/*Tất cả những nam giới tuổi dưới 45*/
SELECT * FROM person 
WHERE gender = 'Male' 
AND DATE_FORMAT(FROM_DAYS(DATEDIFF(now(),birthdate)), '%Y')+0 < 45;

/*Tất cả những nữ giới làm nghề lái xe 'driver'*/
SELECT * FROM person 
WHERE gender = 'Female' 
AND job = 'driver';

/*Tỷ lệ nam/nữ lập trình viên trong tất cả tập dữ liệu*/
SELECT t.job, m.malecount/(t.total - m.malecount) FROM 
(SELECT job, COUNT(*) AS total 
FROM person 
WHERE job = 'developer') AS t 
JOIN 
(SELECT job, COUNT(*) AS malecount 
FROM person WHERE gender = 'Male' AND job = 'developer') AS m ON t.job = m.job;

/*5 thành phố có số lượng nữ lớn nhất*/
SELECT city, COUNT(*) 
FROM person WHERE gender = 'Female'
GROUP BY city
ORDER BY COUNT(*) DESC 
LIMIT 5
