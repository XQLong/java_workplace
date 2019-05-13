**union_find算法**

- 动态连通性：
    <div>
        <img src="https://github.com/XQLong/java_workplace/blob/master/src/Algorithms/pics/union.png"></img>
    </div>
    
    假设“相连”是一种等价关系，具有以下特点：
    ````
    1、自反性：p和p是相连的
    2、对称性：如果p和q是相连的，则q和p也是相连的
    3、传递性：如果p和q是相连的，q和r是相连的，那么p和r也是相连的
    ````
    
    <div>
        <img src="https://github.com/XQLong/java_workplace/blob/master/src/Algorithms/pics/connected.png"></img>
    </div>
    
- quick find算法

    定义一种数据结构用来存储动态连通性问题的数据信息：
    <div>
        <img src="https://github.com/XQLong/java_workplace/blob/master/src/Algorithms/pics/data_structure.png"></img>
    </div>
    如图所示，使用整型数组的索引来代表数据，若长度为N的数组则可以表示N个数据；用数组值来表示数据的分组，
    当且仅当值相等时两个数据具有连通性。
    
    算法主要函数（步骤）：
    ````
    Find:检查p和q是否具有连通性
    Union：将p和q归并到相同的分量中，更改其id值
    ````
    
    算法时间复杂度为O（n*n）。