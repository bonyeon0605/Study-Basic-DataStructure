### 기본 자료구조

> 자료구조는 자료를 효율적으로 이용할 수 있도록 컴퓨터에 저장하는 방법     

   
1-1.선형 검색 - 배열에서의 검색으로 앞에서부터 순서대로 검색을 하며, 순차 검색으로도 불림      
   1)검색의 종료 조건은 2개   
    1. 검색할 값을 발견하지 못하고 배열이 끝나는 경우   
    2. 검색할 값과 같은 요소를 발견하는 경우   
    3. 보초법을 활용하면 비용을 반으로 줄일 수 있음   

 
1-2. 이진 검색 - 전제조건은 이미 정렬되어 있어야 함. 선형 검색보다 빠름  
         가운데를 기준으로 자르고 비교하여 또 자른 값에서 가운데를 기준으로 비교하며 값을 찾아나감   
   1). 종료 조건   
    1. a[pc]와 key가 일치하는 경우   
    2. 검색 범위가 더 이상 없는 경우

>복잡도
> 1. 시간 복잡도 - 실행에 필요한 시간을 평가한 것
> 2. 공간 복잡도 - 기억 영역과 파일 공간이 얼마나 필요한가를 평가한 것 


04-1. 스택   
스택이란 - 가장 나중에 넣은 데이터를 가장 먼저 꺼냄(Last in First out)   
데이터를 넣는 작업을 푸시(push), 데이터를 꺼내는 작업을 팝(pop)


04-2. 큐
큐란 - 가장 먼저 넣은 데이터를 가장 먼저 꺼내는 구조(First in First out)    
데이터를 넣는 작업을 인큐, 데이터를 꺼내는 작업을 디큐, 데이터를 꺼내는 쪽을 프론트, 데이터를 넣는 쪽을 리어   

05-1. 재귀의 기본
재귀란 - 어던 사건이 자기 자신을 포함하고 다시 자기 자신을 사용하여 정의될 때 재귀적이라 표현
>재귀 호출은 '메서드 자신'을 호출하는 것이라고 이해하기보다는 '자기자신과 똑같은 메서드'를 호출한다고 이

06-1. 정렬
정렬인란 - 핵심 항목(key)의 대소관계에 따라 데이터 집합을 일정한 순서로 줄지어 늘어서도록 바꾸는 작업   
안정된 정렬이란 - 같은 갓의 키를 가진 요소의 순서가 정렬 전후에도 유지되는 것
내부정렬과 외부정렬
1. 내부정렬 : 정렬할 모든 데이터를 하나의 배열에 저장할 수 있는 경우 사용하는 알고리즘
2. 외부정렬 : 정렬할 데이터가 너무 많아서 하나의 배열에 저장할 수 없는 경우 사용하는 알고리즘   

정렬 알고리즘의 핵심 요소
>교환, 선택, 삽입

06-2. 버블정렬 - 이웃한 두 요소의 대소 관계를 비교하여 교환을 반복   
06-3. 단순선택정렬 - 가장 작은 요소부터 선택해 알맞은 위치로 옮겨서 순서대로 정렬하는 알고리즘   
06-4. 단순삽입정렬 - 선택한 요소를 그보다 더 앞쪽의 알맞은 위치에 '삽입하는' 작업을 반복   
06-6. 퀵 정렬   
06-7. 병합 정렬 - 배열을 앞부분과 뒷부분으로 나누어 각가 정렬한 다음 병합하는 작업을 반   
06-8. 힙 정렬 - '가장 큰 값이 루트에 위치'하는 특징을 이용하는 정렬 알고리즘   
 

07-1. 집합 - 명확한 조건을 만족하는 자료의 모임    
1. 집합과 요소   
집합이란 객관적으로 범위를 규정한 '어떤 것'의 모임   
   그 집합 안에서 각각의 '어떤 것' 을 요소라 부름 **집합의 요소에는 순서가 없는 것이 특징**
   
07-2. 배열로 집합

   






