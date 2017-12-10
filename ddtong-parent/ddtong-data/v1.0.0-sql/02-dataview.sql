DROP VIEW IF EXISTS v_login_user;
CREATE VIEW v_login_user AS SELECT
	t.id,
	1 AS userType,
	t.nick_name,
	t.phone,
	t.`password`,
	t.pay_password,
	t.source_uid,
	t.source_type,
	t.cid,
	t.real_name,
	t.state
FROM
	t_custom t
UNION
	SELECT
		t.id,
		2 AS userType,
		t.nick_name,
		t.phone,
		t.`password`,
		t.pay_password,
		t.source_uid,
		t.source_type,
		t.cid,
		t.real_name,
		t.state
	FROM
		t_merchant t;