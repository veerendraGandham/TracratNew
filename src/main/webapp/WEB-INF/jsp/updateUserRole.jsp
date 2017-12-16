<html>
<body bgcolor="gray">
<h1 style="color: yellow;"><center>${responce }</center></h1>
	<h1 align="center" style="color: red;">UpdateUserRoleForm</h1>
	<form action="user_update_role" method="post">
		<table align="center" border="1">

			<tr>
				<td>RoleId::</td>
				<td><input type="text" name="role_id" /></td>
			</tr>
			<tr>
				<td>UserId::</td>
				<td><input type="text" name="user_id" /></td>
			</tr>
			<tr>
				<td>Status::</td>
				<td><input type="text" name="status" /></td>
			</tr>
			<tr>
				<td>CreatedDate::</td>
				<td><input type="date" name="created_date" /></td>
			</tr>
			<tr>
				<td>CreatedBy::</td>
				<td><input type="text" name="created_by" /></td>
			</tr>
			<tr>
				<td>ModifiedDate::</td>
				<td><input type="date" name="modified_date" /></td>
			</tr>
			<tr>
				<td>ModifiedBy::</td>
				<td><input type="text" name="modified_by" /></td>
			</tr>

				<td><input type="submit" value="Enter">
		</table>
	</form>
</body>
</html>