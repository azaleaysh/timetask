create table if not exists time_task_course
(
	course_id int auto_increment primary key,
	course_name varchar(64) not null,
	location varchar(256) null,
	day_of_week int null,
	start_time int null,
	end_time int null
);