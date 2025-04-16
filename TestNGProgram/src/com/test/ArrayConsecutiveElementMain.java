package com.test;

public class ArrayConsecutiveElementMain 
{
	private int getMinimum(int arr[], int n)
	{
	int min = arr[0];
	for (int i = 1; i < n; i++)
	if (arr[i] < min)
	min = arr[i];
	return min;
	}
	 
	/* Method return maximum value
	private int getMaximum(int arr[], int n)
	{
	int max = arr[0];
	for (int i = 1; i < n; i++)
	if (arr[i] > max)
	max = arr[i];
	return max;*/
}
