# Proje 2

## [16,21,11,8,12,22] -> Merge Sort

Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.

Big-O gösterimini yazınız.

### Cevap:

---

[16,21,11,8,12,22] dizisinin Merge Sort türüne göre aşamaları:

```java
        [16,21,11,8,12,22]
               /     \
        [16,21,11] [8,12,22]
           /   \       /   \
      [16,21] [11]  [8,12] [22]
           \   /       \    /
        [11,16,21]  [8,12,22]
               \       /
        [8,11,12,16,21,22]
```

Big-O gösterimi:

```java
        [16,21,11,8,12,22]
               /     \                  n/2
        [16,21,11] [8,12,22] --> n
           /   \       /   \            n/4
      [16,21] [11]  [8,12] [22] --> n
           \   /       \    /           n/8
        [11,16,21]  [8,12,22] --> n
               \       /                n/16
        [8,11,12,16,21,22] --> n

2^x = n => x = logn => Big-O Notation: O(nlogn)
```
