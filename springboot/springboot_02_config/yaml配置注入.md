# yaml语法学习
## 配置文件
SpringBoot使用一个全局的配置文件 ， 配置文件名称是固定的
- application.properties
    - 语法结构 ：key=value
- application.yml
    - 语法结构 ：key：空格 value

# yaml基础语法
1. 空格不能省略
2. 以缩进来控制层级关系，只要是左边对齐的一列数据都是同一个层级的。
3. 属性和值得大小写都是敏感的

**字面量： 普通的值**  
字面量直接写在后面就可以 ， 字符串默认不用加上双引号或者单引号；  
注意：
- “ ” 双引号，不会转义字符串里面的特殊字符 ， 特殊字符会作为本身想表示的意思；

`比如 ：name: "kuang \n shen"   输出 ：kuang  换行   shen`

- '' 单引号，会转义特殊字符 ， 特殊字符最终会变成和普通字符一样输出

`比如 ：name: ‘kuang \n shen’   输出 ：kuang  \n   shen`