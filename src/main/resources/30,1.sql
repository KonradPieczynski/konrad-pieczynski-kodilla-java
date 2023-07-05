DROP FUNCTION IF EXISTS ShowName;

DELIMITER $$

CREATE FUNCTION ShowName(userID INT) RETURNS VARCHAR(20) NOT DETERMINISTIC
BEGIN
   DECLARE result VARCHAR(20) DEFAULT 'Wrong id';
   DECLARE result2 VARCHAR(20) DEFAULT '';
   IF userID > 0 THEN
   SET result = (SELECT FIRSTNAME from readers where READER_ID = userID);
   SET result2 = (SELECT LASTNAME from readers where READER_ID = userID);
   IF result is NULL THEN
   SET result = 'No such user';
   RETURN result;
   END IF;
   RETURN CONCAT(result,", ",result2);
   ELSE
   RETURN result;
   END IF;   
END $$

DELIMITER ;

SELECT ShowName(1), ShowName(2), Showname (12),Showname(0);