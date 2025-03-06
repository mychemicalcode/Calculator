# 계산기 Lv.1


<br>


### 개발 기간
- 25.03.04 ~ 25.03.05


### 개발 환경
- Java


### 주요 기능
- 정수 입력 받기
- 사칙연산 입력 받기
- 특정 상황 예외 처리
- 조건 부 반복 시행
- 결과값 출력


### 프로젝트 구상
1. 첫번쨰 정수, 두번쨰 정수 입력
2. 사칙연산 입력 및 연산
3. 조건부 예외처리
4. 결과값 출력
5. 조건부 반복


### 실행 및 과정
[1] 첫번째 정수, 두번쨰 정수 입력

![image](https://github.com/user-attachments/assets/8afaff02-1238-4b72-97c5-5151e68a8641)


<br>
[2] 사칙연산 입력 및 연산  

![image](https://github.com/user-attachments/assets/6f161122-37d9-4fac-a273-30f0989237d4)


<br>
[3] 조건부 예외처리

![image](https://github.com/user-attachments/assets/b4f2d9e7-633b-4f2f-9368-f2baef4b32bc)


<br>
[4] 결과값 출력 및 조건부 반복

![image](https://github.com/user-attachments/assets/c964099f-be36-4384-8b71-05a192c0103d)


### 트러블 슈팅
1. 조건부 예외처리 실행 오류

![image](https://github.com/user-attachments/assets/a4ed288e-0c28-4137-8b4b-286ef416ff11)

기존 break문에서 continue문으로 변경한 결과 오류가 발생하였다.

continue문의 진행 원리를 파악한 후 변수 설정 및 while문의 코드를 수정하여 정상작동 될 수 있도록 수정하였다.



