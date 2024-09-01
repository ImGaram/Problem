-- 아이스크림의 성분 타입에 대한 아이스크림의 총 주문량 조회
-- 주문량이 작은 순서대로 조회(오름차순)
SELECT i.ingredient_type, SUM(h.total_order) AS TOTAL_ORDER
FROM first_half h JOIN icecream_info i ON h.flavor = i.flavor
GROUP BY i.ingredient_type
ORDER BY TOTAL_ORDER ASC