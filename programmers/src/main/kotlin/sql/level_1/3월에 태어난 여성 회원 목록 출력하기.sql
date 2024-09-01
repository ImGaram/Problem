SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') as DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE GENDER = "W" and TLNO is not null and DATE_OF_BIRTH like '%-03-%'
-- date_format: 설정한 부분의 날짜 형식을 변경할 수 있음(DATE_FORMAT(DATE_DATA, '날짜 형식')
    -- 참고 자료: https://devjhs.tistory.com/89
-- is not null: 설정한 데이터가 null이 아님(data IS NOT NULL)
-- like: 설정한 데이터에서 특정한 데이터를 검색하기 위함(%: 임의의 길이, _: 글자 제한)