package tml.xiaochun.cicd_test.chain;

/**
 * @Author：XiaoChun
 * @Date：2024/7/15 上午11:26
 */
public interface Chain<T> {
    void setNext(T chain);
}