create proc getuser
@username varchar(50), @password char(32), @out int out
as
select @out = count(*) 
from USERS
where USERNAME = @username and PASSWORD = @password

go

declare @out int 
exec getuser "ADMIN", "a788f6d55914857d4b97c1de99cb896b", @out out

select @out
