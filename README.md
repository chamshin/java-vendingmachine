## TDD 연습

## 기능 요구 사항


- [x] 잔돈 모듈에 동전을 넣으면 얼마가 들었는지 알 수 있다.
- [x] 잔돈 모듈에 든 금액을 차감할 수 있다.
- [x] VendingMachine을 ChangesModule로 변경한다.
- [x] 동전은 500원, 100원 ,50원, 10원이 있다.
- [ ] 없는 금액의 동전인 경우
- [ ] 최소 개수의 동전으로 잔돈을 돌려준다.
    - [x] 10원이 남아 있다면 10원 동전 1개를 돌려준다.
    - [x] 50원이 남아 있다면 50원 동전 1개를 돌려준다.
    - [x] 1000원이 남아 있다면 500원 동전 2개를 돌려준다.
    - [x] 20원이 남아 있다면 10원 동전 2개를 돌려준다.
    - [x] 600원이 남아 있다면 500원 동전 1개와 100원 1개를 돌려준다.
    - [x] 650원이 남아 있다면 500원 동전 1개와 100원 동전 1개와 50원 동전 1개를 돌려준다.
    - [ ] 동전으로 잔돈을 거슬러 줄 수 없는 경우에도 최소 개수의 동전을 잔돈으로 돌려준다.
- [ ] 최소 구입 금액 미만인 경우 잔돈이 반환된다.
- [ ] 반환 요청을 하는 경우 잔돈이 반환된다.
