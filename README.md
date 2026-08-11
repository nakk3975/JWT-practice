# Spring Security & JWT Practice

Spring Security 기반 회원 인증과 JWT 적용 과정을 학습하기 위해 만든 Spring Boot 프로젝트입니다.

## 현재 구현 내용

- 회원가입 기능
- BCrypt 기반 비밀번호 암호화
- JPA를 이용한 회원 데이터 저장 및 조회
- Spring Security Form Login 구성
- 사용자 이름 기반 회원 조회
- `UserDetailsService`를 통한 인증 사용자 로딩
- Thymeleaf 로그인 화면 구성
- JWT 라이브러리 추가 및 JWT 인증 확장을 위한 기반 구성

## 기술 스택

- Java 17
- Spring Boot 3.3.4
- Spring Security
- Spring Data JPA
- Thymeleaf
- MySQL
- Lombok
- JJWT 0.12.5
- Gradle

## 실행 방법

Java 17과 MySQL을 준비하고 로컬 DB 접속 정보를 설정한 뒤 실행합니다.

```bash
./gradlew bootRun
```

Windows:

```bash
gradlew.bat bootRun
```

## 참고

현재 코드는 Spring Security의 폼 로그인과 회원 인증 흐름이 구현된 학습 단계이며, JWT 관련 의존성을 추가해 토큰 기반 인증으로 확장하는 과정을 연습하기 위한 저장소입니다.
