# JavaLetterCounter


This is the Java implementation of a program solving a toy problem proposed to me by a teacher. It counts the occurences of each letter in a given string.
You can check out the C/C++ implementation [here](https://github.com/Sebastian-Heinzenburger/CppLetterCounter)

## Build/Run

```console
$ cd src
$ javac com/sebastian/Main.java
$ java com.sebastian.Main
```

## Example Output

### Commandline Argument
```console
$ java com.sebastian.Main "here are many letters!"
 : 3
a: 2
!: 1
r: 3
s: 1
t: 2
e: 5
h: 1
y: 1
l: 1
m: 1
n: 1
```

### From stdin

```console
$ cat /etc/hostname | java com.sebastian.Main
p: 2
a: 1
t: 1
l: 1
o: 1
```
