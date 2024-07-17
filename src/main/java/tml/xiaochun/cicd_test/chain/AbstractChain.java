package tml.xiaochun.cicd_test.chain;

import tml.xiaochun.cicd_test.annotation.Infuse;

/**
 * @Author：XiaoChun
 * @Date：2024/7/15 上午11:34
 */
public class AbstractChain implements Chain<AbstractChain>{
    protected AbstractChain next;

    @Override
    public void setNext(AbstractChain chain) {
        this.next = chain;
    }

    public void failToDo(@Infuse String str, String sss){

    }
}
