-- nexial:result1
SELECT OFFICELOCATIONDESC AS "description", ADDRESSLINE1 || ' ' || ADDRESSLINE2 || ', ' || CITY || ' ' || OFFICELOCATIONSTATE || ' ' || ZIP || ' ' || COUNTRY AS "fullAddress" FROM OFFICELOCATIONS WHERE OFFICELOCATIONCODE = '${code}';

-- nexial:result2
SELECT OFFICELOCATIONDESC AS "description", ADDRESSLINE1 || ' ' || ADDRESSLINE2 || ', ' || CITY || ' ' || OFFICELOCATIONSTATE || ' ' || ZIP || ' ' || COUNTRY AS "fullAddress" FROM OFFICELOCATIONS WHERE OFFICELOCATIONID > ${min. Location ID};
