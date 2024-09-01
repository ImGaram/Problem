SELECT o.animal_id, o.name
FROM animal_ins i RIGHT JOIN animal_outs o ON o.animal_id = i.animal_id
WHERE i.animal_id IS NULL
-- right join: 서로 다른 테이블 a, b가 있을 때, a의 데이터를 보존하고 b의 데이터를 이용해 join 하는 방법
    -- 한 테이블에는 존재하지만 다른 테이블에서는 존재하지 않은 데이터를 활용하고자 할 때, 사용하도록.
-- is null: 특정 item이 null인가?