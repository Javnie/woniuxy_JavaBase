package com.woniuxy.day007.membersmanage;

import java.util.Arrays;

public class MemberManageDAO {
    private int actualLen = 0;
    private int arrLen = 10;
    private Member[] memArr = new Member[arrLen];

    void add(Member member) throws Exception {
        if (member == null) throw new Exception("input cannot be null");

        if (actualLen == arrLen) {
            arrLen = arrLen * 2;
            memArr = Arrays.copyOf(memArr, arrLen);
        }

        memArr[actualLen++] = member;
    }

    /**
     * @param member
     * @param index  预传入member所在索引位置
     * @throws Exception
     */
    void add(Member member, int index) throws Exception {
        if (member == null) throw new Exception("input cannot be null");

        if (actualLen == arrLen) {
            arrLen = arrLen * 2;
            memArr = Arrays.copyOf(memArr, arrLen);
        }

        if (index > actualLen - 1)
            memArr[actualLen++] = member;
        else {
            System.arraycopy(memArr, index, memArr, index + 1, actualLen - index);
            memArr[index] = member;
            actualLen++;
        }
    }

    int search(String name) throws Exception {
        if (name == null) throw new Exception("input cannot be null");
        if (actualLen == 0) throw new Exception("the array's got no data");

        int index = -1;
        for (int i = 0; i < actualLen; i++) {
            if (memArr[i].getName().equals(name)) {
                index = i;
                break;
            }
        }
        return index;
    }

    boolean delete(String name) throws Exception {
        if (name == null) throw new Exception("input cannot be null");
        if (actualLen == 0) throw new Exception("the array's got no data");

        int index = -1;
        for (int i = 0; i < actualLen; i++) {
            if (memArr[i].getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            for (int i = index; i < actualLen - 1; i++) {
                memArr[i] = memArr[i + 1];
            }
            actualLen--;
            return true;
        }
    }

    void list() throws Exception {
        if (actualLen == 0) throw new Exception("the array's got no data");

        for (int i = 0; i < actualLen; i++) {
            System.out.println(memArr[i]);
        }
    }
}
