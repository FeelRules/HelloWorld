package com.example.myapplication.slice;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.DependentLayout;
import ohos.agp.components.DependentLayout.LayoutConfig;
import ohos.agp.components.Text;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.Color;

import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_PARENT;
import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_CONTENT;

public class SecondAbilitySlice extends AbilitySlice {

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        // 声明布局
        DependentLayout myLayout = new DependentLayout(this);
        // 设置布局大小
        myLayout.setWidth(MATCH_PARENT);
        myLayout.setHeight(MATCH_PARENT);
        ShapeElement element = new ShapeElement();
        element.setRgbColor(new RgbColor(255, 255, 255));
        myLayout.setBackground(element);

        // 创建一个文本
        Text text = new Text(this);
        text.setText("Nice to meet you.");
        text.setWidth(MATCH_PARENT);
        text.setTextSize(55);
        text.setTextColor(Color.BLACK);
        // 设置文本的布局
        DependentLayout.LayoutConfig textConfig = new DependentLayout.LayoutConfig(MATCH_CONTENT,MATCH_CONTENT);
        textConfig.addRule(LayoutConfig.CENTER_IN_PARENT);
        text.setLayoutConfig(textConfig);
        myLayout.addComponent(text);

        super.setUIContent(myLayout);
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}