SELECT u.user_id, u.nickname, sum(b.price) as TOTAL_SALES
FROM used_goods_board b JOIN used_goods_user u ON u.user_id = b.writer_id
WHERE b.status = "DONE"
GROUP BY b.writer_id
HAVING SUM(b.price) >= 700000
ORDER BY total_sales asc
-- join: 서로 다른 두 테이블의 데이터를 합칠 수 있음
-- 참고: https://data-marketing-bk.tistory.com/entry/SQL-JOIN-%ED%95%9C-%EB%B0%A9%EC%97%90-%EC%A0%95%EB%A6%AC-%EA%B0%9C%EB%85%90%EB%B6%80%ED%84%B0-%EC%BD%94%EB%93%9C%EA%B9%8C%EC%A7%80-%EC%9D%B4%EA%B2%83%EB%A7%8C-%EB%B3%B4%EC%9E%90
-- group by: 특정 열을 기준으로 group으로 묶을 수 있다.
-- having: group by 를 사용할 때의 조건을 설정한다.