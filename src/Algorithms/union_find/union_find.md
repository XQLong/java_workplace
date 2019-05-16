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
    
- quick union算法
    <div>
        <img src="https://github.com/XQLong/java_workplace/blob/master/src/Algorithms/pics/quickunion_datastructure.png"></img>
    </div>
    定义数据结构，如图所示。使用整型数组的索引来代表数据，数组的值表示数据的父节点，当数据的索引值即为数组值时
    则该节点为根节点。当节点具有相同的根节点时，表示数据间具有连通性。
    
    算法主要函数（步骤）：
    ````
    Find:检查p和q是否具有连通性（是否具有相同的根节点）
    Union：将p和q归并到相同的分量中（将p的根节点设置为q的根节点）
    ````
    <div>
        <img src="https://github.com/XQLong/java_workplace/blob/master/src/Algorithms/pics/quick_union.png"></img>
    </div>
    
    算法的时间复杂度为O(N)。
    
- 算法改进
    
    1、跟踪每棵树中对象的个数，用作加权。使用带权操作，避免得到一颗很高的树，确保
    小树的根节点作为大树的根节点的子节点以维持平衡。
    
    2、使用路径压缩。当我们试图寻找包含给定节点的根节点时，我们需要访问从该节点到
    根节点路径上的每个节点，与此同时我们可以将每个节点都指向根节点。
    