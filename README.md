# 상품 관리 REST API

## 1. 프로젝트 소개

### 주제 및 주요 기능

Spring Boot와 JPA를 활용한 상품 관리 REST API이다.
상품 등록·조회·수정·삭제를 구현했다.

### Entity 필드 구조

Product 엔티티는 products ㅌ테이블에 매핑된다.

| 필드 | 타입 | 설명 |
| --- | --- | --- |
| id | Long | 자동 생성되는 기본 키 |
| name | String | 상품명, 필수, 최대 100자 |
| price | Integer | 가격, 필수, 0 이상 |
| category | String | 카테고리, 최대 50자 |
| stock | Integer | 재고, 필수, 0 이상 |
| description | String | 설명, 최대 1,000자 |

### 프로젝트 구조 및 개발환경

- 개발환경: Java 17, Spring Boot 4.1.2, Spring Data JPA, MariaDB, Gradle
- 구조: Controller → Service → Repository → DB
- API 경로: /api/products (POST·GET), /api/products/{id} (GET·PUT·DELETE)



### 저장소 및 배포 주소

- GitHub Repository URL: https://github.com/2026-2-WebService/assign09-c01-22500802
- 개인 저장소: https://github.com/yechan-7942/2026WEB_assign_09
- Render Deployment URL:
- 배포 주소: https://two026web-assign-09-1.onrender.com
- 상품 전체 조회: https://two026web-assign-09-1.onrender.com/api/products

## 2. Database SQL Practice

### 1. 기존 Table 조회 및 데이터 추가 결과

![기존 데이터 1개 추가](images/product-insert.png)

![기존 데이터 추가 확인](images/product-select.png)

### 2. 새 테이블 생성 SQL

![새 테이블 SQL 실습 결과](images/sql-practice.png)
![movie_insert.png](../../../Desktop/movie_insert.png)

### 3. INSERT / UPDATE / DELETE / SELECT SQL과 실행 결과
insert ![movie_insert.png](../../../Desktop/movie_insert.png)
update ![movie_update.png](../../../Desktop/movie_update.png)
delete ![movie_delete.png](../../../Desktop/movie_delete.png)
Select![select.png](../../../Desktop/select.png)
Seletct_title_rating ![title_rating.png](../../../Desktop/title_rating.png)
Selectct_sf ![sf.png](../../../Desktop/sf.png)
