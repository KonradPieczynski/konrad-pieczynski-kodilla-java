DROP FUNCTION IF EXISTS ShowName;

DELIMITER $$

CREATE FUNCTION ShowName(userID INT) RETURNS VARCHAR(20) DETERMINISTIC
BEGIN
    DECLARE result VARCHAR(20) DEFAULT 'Wrong id';
    DECLARE result2 VARCHAR(20) DEFAULT '';
    IF userID > 0 THEN
        SET result = (SELECT FIRSTNAME from READERS where READER_ID = userID);
        SET result2 = (SELECT LASTNAME from READERS where READER_ID = userID);
        IF result is NULL THEN
            SET result = 'No such user';
            RETURN result;
        END IF;
        RETURN CONCAT(result,', ',result2);
    ELSE
        RETURN result;
    END IF;
END $$

DELIMITER ;

COMMIT;

SELECT ShowName(1), ShowName(2), Showname (12),Showname(0);