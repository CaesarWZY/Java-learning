# 重学java重走长征路

## 理论

本文理论知识均为head first Java

### 基本程序结构

**类(class)**存于源文件里面

**方法(method)**存于类中

**语句(statement)**存于方法中

![image-20210916164019987](C:\Users\王志宇\AppData\Roaming\Typora\typora-user-images\image-20210916164019987.png)

### java中注解

参考：https://www.runoob.com/w3cnote/java-annotation.html

菜鸟教程

### JVM（重点）

JVM是Java Virtual Machine（Java虚拟机）的缩写，JVM是一种用于计算设备的规范，它是一个虚构出来的计算机，是通过在实际的计算机上仿真模拟各种计算机功能来实现的。
引入Java语言虚拟机后，Java语言在不同平台上运行时不需要重新编译。Java语言使用Java虚拟机屏蔽了与具体平台相关的信息，使得Java语言编译程序只需生成在Java虚拟机上运行的目标代码（字节码），就可以在多种平台上不加修改地运行。

详解参考：https://blog.csdn.net/qq_41701956/article/details/81664921

## 环境搭建

 Java 环境搭建 settled

IDE: VSCode

Reference:https://blog.csdn.net/weixin_40448140/article/details/105904836

VSCode相关插件：

​		Language Support for Java by RED HAT

​		Debugger for Java

​		Java Test Runner 

​		Maven for Java

​		Project Manager for Java

### Doubt

1.使用VSCode运行面向对象的Java程序不生成 类名.class的文件，直接在IDE中编译生成了结果

2.使用VSCode进行项目管理的时候，无法使用全部的git 命令，有两种解决办法：

一、使用git bash(conventional way)

二、研究一下VS Code

## 第一个java程序

国际惯例 HelloWorld：

```java
/*
@ Author: CaesarWZY
Time:2021/09/16
*/
package chapter01;
public class HelloWorld {
    public static void main(String[] args) throws Exception{
        System.out.println("HelloWorld");
    }
}

```

## 进度追踪

| 时间       | 进度         | 完成情况             |
| :--------- | ------------ | -------------------- |
| 2021/09/16 | 书上的前两章 | 略慢（右边有个傻逼） |
|            |              |                      |
|            |              |                      |

The public type Test must be defined in its own file

## 补充

本文所涉及只是均为学习使用，如有需要请联系870026099@qq.com



