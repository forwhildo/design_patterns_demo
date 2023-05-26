package two.fix;

/**
 * @author: wxm
 * @description: TODO
 * @date: 2023/5/15 10:21
 */
public class Demo {
    private Serializable serializable;
    //传递实现类，但是接口只有这几个方法，完成隔离，只依赖了serializable的接口
    public Demo(Serialization serializable){
        this.serializable = serializable;
    }
}