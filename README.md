# Proje 1

## 1. [22,27,16,2,18,6] -> Insertion Sort

Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

Big-O gösterimini yazınız.

Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız

- Average case: Aradığımız sayının ortada olması
- Worst case: Aradığımız sayının sonda olması
- Best case: Aradığımız sayının dizinin en başında olması.

### Cevaplar:

---

[22,27,16,2,18,6] dizisinin Insertion Sort türüne göre aşamaları:

```java
[22,27,16,2,18,6]
[16,22,27,2,18,6]
[2,16,22,27,18,6]
[2,16,18,22,27,6]
[2,6,16,18,22,27]
```

Big-O gösterimi:

```java
[22,27,16,2,18,6] n
[16,22,27,2,18,6] n-1
[2,16,22,27,18,6] n-2
[2,16,18,22,27,6] n-3
[2,6,16,18,22,27] n-4

n + (n-1) + (n-2) + (n-3) + (n-4) = n*((n+1)/2) => Big-O Notation: O(n^2)
```

Time Complexity:

```java
Dizi sıralandıktan sonra şu şekilde görünür:
[2,6,16,18,22,27]

Aradığımız 18 sayısının dizideki yeri şu şekildedir:
[2,6,16,18,22,27]
         |
```

Bu durumda 18 sayısı _**Average Case**_ kapsamına girer.

## 2. [7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort türüne göre aşamaları:

```java
[7,3,5,8,2,9,4,15,6]
[2,7,3,5,8,9,4,15,6]
[2,3,7,5,8,9,4,15,6]
[2,3,4,7,5,8,9,15,6]
[2,3,4,5,7,8,9,15,6]
[2,3,4,5,6,7,8,9,15]
```
