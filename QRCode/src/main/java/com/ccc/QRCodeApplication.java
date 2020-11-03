package com.ccc;

import com.ccc.util.QRCodeUtil;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/23 23:05
 */
public class QRCodeApplication {
    public static void main(String[] args) throws Exception {
        // 存放在二维码中的内容
        // 二维码中的内容可以是文字，可以是链接等
        String text = "猪猪最爱我的小妞妞";
        // 嵌入二维码的图片路径
        //String imgPath = "C:\\Users\\Administrator\\Pictures\\img\\dog.jpg";
        // 生成的二维码的路径及名称
        //String destPath = "E:\\学习资料\\新建文件夹\\code" + System.currentTimeMillis() + ".jpg";
        String destPath = "E:\\学习资料\\新建文件夹\\code" + text + ".jpg";
        //生成二维码
        QRCodeUtil.encode(text, null, destPath, true);
        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);
    }
}
