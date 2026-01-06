# 🌱🌱🌱이름 변경 java-lotto-precourse

## 📋 목차
- [프로젝트 소개](#프로젝트-소개)
- [실행 방법](#실행-방법)
- [구현 기능 목록](#구현-기능-목록)
- [커밋 컨벤션](#커밋-컨벤션)

---

## 프로젝트 소개
> 이 프로젝트는 우아한형제들 최종 코딩테스트로, 객체지향 원칙을 적용하여 🌱🌱🌱을 구현한 콘솔 애플리케이션입니다.
> 🌱🌱🌱한 줄 설계

### 프로젝트 핵심 프로세스
- 객체지향 원칙
- TDD 개발 방식
- 책임 분리 및 단일 책임 원칙

---

### 책임 분리
```markdown
Controller (LottoController) ➡️ View (InputView, OutputView)
  ↓
Service (LottoService) 
  ↓
Domain (Lotto, Lottos, WinningLotto, LottoStatistics)
```

---

## 실행 방법
### 1. 사전 요구사항
- java 21

### 2. 실행 예시
```markdown
구입금액을 입력해 주세요.
5000

5개를 구매했습니다.
[40, 1, 42, 32, 37, 10]
[4, 44, 42, 1, 18, 13]
[39, 37, 10, 14, 43, 33]
[31, 34, 26, 44, 37, 16]
[28, 20, 26, 33, 9, 35]

당첨 번호를 입력해 주세요.
1,4,18,2,3,9

보너스 번호를 입력해 주세요.
20

당첨 통계
---
3개 일치 (5,000원) - 1개
4개 일치 (50,000원) - 0개
5개 일치 (1,500,000원) - 0개
5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
6개 일치 (2,000,000,000원) - 0개
총 수익률은 100.0%입니다.
```

---

## 구현 기능 목록

### 1. 입출력 기능

- [x]  메뉴 추천 시작 메시지를 출력한다.
- [x]  코치 이름 입력 메시지를 출력한다.
- [x]  코치 이름을 입력받는다.
- [x]  못 먹는 메뉴 입력 메시지를 출력한다.
- [x]  못 먹는 메뉴를 입력받는다.
- [ ]  추천 메뉴를 출력한다.
- [ ]  추천 완료 메시지를 출력한다.

### 2. 핵심 로직 기능

- [x]  입력받은 코치 이름을 ,을 기준으로 split 하여 저장한다.
- [x]  못 먹는 메뉴를 ,을 기준으로 split 하여 저장한다.
- [ ]  카테고리를 선택한다.
- [ ]  카테고리가 이미 두번 선택된 카테고리라면 다시 선택한다.
- [ ]  메뉴를 선택한다.
- [ ]  선택한 메뉴가 이미 먹었던 메뉴면 다시 선택한다.
- [ ]  선택한 메뉴가 먹을 수 없는 메뉴면 다시 선택한다.
- [ ]  메뉴를 선택하지 않은 인원수가 혼자 선택한 메뉴를 가진 사람의 인원수와 같거나, 1명 많은 경우, 무조건 혼자 선택한 메뉴를 가진 사람의 메뉴를 선택해야 한다.
- [ ]  추천받은 메뉴가 이미 5명이 선택한 메뉴라면 다른 메뉴를 선택한다.

### 3. 예외 처리 기능

- [x]  입력받은 코치 이름이 1명 이하일 경우 IllegalArgumentException으로 에러 메시지를 출력한 후 다시 입력받는다.
- [x]  입력받은 코치 이름이 2~4글자가 아닐 경우 IllegalArgumentException으로 에러 메시지를 출력한 후 다시 입력받는다.
- [x]  입력받은 못 먹는 메뉴가 없는 메뉴일 경우 IllegalArgumentException으로 에러 메시지를 출력한 후 다시 입력받는다.
- [ ]  입력받은 못 먹는 메뉴가 0~2개가 아닐 경우 IllegalArgumentException으로 에러 메시지를 출력한 후 다시 입력받는다.

### 4. 기타

- [ ]  프로그램 종료시에 자원을 정리한다.

---

## 커밋 컨벤션

Following convention : https://gist.github.com/stephenparish/9941e89d80e2bc58a153

```markdown
# basic structure
<type>(<scope>): <subject>
<BLANK LINE>
<body>
<BLANK LINE>
<footer>

# <type>
feat (feature)
fix (bug fix)
docs (documentation)
style (formatting, missing semi colons, …)
refactor
test (when adding missing tests)
chore (maintain)

# <scope>
console - I/O
domain - 핵심 로직
validation - 유효성검사
test - 테스트코드 추가
```