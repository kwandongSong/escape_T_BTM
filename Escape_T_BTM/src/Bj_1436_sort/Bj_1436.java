package Bj_1436_sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Scanner 형식보다 BufferedReader 형식이 훨씬 빠름

자바(JAVA) 형 변환(String과 int)

# String to Int
String from = "123";
int to = Integer.parseInt(from);

# Int to String
int from = 123;
String to = Integer.toString(from);

# String 붙혀넣기
1. concat을 사용
String str1 = "Hello"
String str2 = "World!" 
String result = str1.concat(str2)

2. + 연산자를 통해 붙혀넣기
String result = str1 + str2

# String 포함하는 문자열 있는지 확인 
str.contains(비교 str);
*/

public class Bj_1436 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n_th = Integer.parseInt(br.readLine());
		
		int End_num = 666;
		int cnt = 1;
		
		while(cnt != n_th) {
			End_num ++;
			if (Integer.toString(End_num).contains("666")) {
				cnt++;
			}
		}
		
		System.out.println(End_num);
	}
}
