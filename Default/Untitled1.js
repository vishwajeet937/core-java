function removeUppercase(N,str)
{
	var n=str.length;
	for (var i=2;i<n;i++;)
	{
		for (var j=i;j<n;j++;)
		{
			var bag="";
			for (var k=i;ik<n;k++;)
			{
				bag=bag+str[k];
			}
			console.log("bag");
		}
	}
}