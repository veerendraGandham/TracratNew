<html>
<body bgcolor="gray">
${result }
	<h1 align="center" style="color: red;">UpdateUserAddressForm</h1>
	<form action="user_update_address" method="post">
		<table align="center" border="1">
			<tr>
				<td>AddressId::</td>
				<td><input type="text" name="address_id" /></td>
			</tr>
			<tr>
				<td>UserId::</td>
				<td><input type="text" name="user_id" /></td>
			</tr>
			<tr>
				<td>Address1::</td>
				<td><input type="text" name="address1"></td>
			</tr>
			<tr>
				<td>Address2::</td>
				<td><input type="text" name="address2" /></td>
			</tr>
			<tr>
				<td>State::</td>
				<td><input type="text" name="state" /></td>
			</tr>
			<tr>
				<td>Country::</td>
				<td><input type="text" name="country" /></td>
			</tr>
			<tr>
				<td>PinCode::</td>
				<td><input type="text" name="pin" /></td>
			</tr>


			<tr>
				<td><input type="submit" value="Enter">
		</table>
</body>
</form>
</html>