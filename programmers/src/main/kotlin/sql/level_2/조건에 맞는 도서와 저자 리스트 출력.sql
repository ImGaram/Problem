-- 경제 카테고리에 속하는 도서들의 도서 id, 저자명, 출판일, 리스트출력
-- 출판일 기준 오름차순으로 정렬하기
SELECT b.book_id, a.author_name, DATE_FORMAT(b.published_date, '%Y-%m-%d') AS PUBLISHED_DATE
FROM book b JOIN author a ON b.author_id = a.author_id
WHERE b.category = '경제'
order by PUBLISHED_DATE asc
-- join에서 on의 역할: join 이전에 조건을 판단함(where는 join 이후 조건을 판단함) 실행 순서 차이임.