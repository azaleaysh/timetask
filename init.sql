create table if not exists time_task_course
(
	course_id int auto_increment primary key,
	course_name varchar(64) not null,
	location varchar(256),
	day_of_week int,
	start_time datetime,
	end_time datetime,
	times varchar(2)
);