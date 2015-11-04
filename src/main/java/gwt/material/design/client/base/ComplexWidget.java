package gwt.material.design.client.base;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Focusable;
import com.google.gwt.user.client.ui.HasEnabled;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.base.mixin.FontSizeMixin;
import gwt.material.design.client.constants.TextAlign;
import gwt.material.design.client.constants.CenterOn;
import gwt.material.design.client.constants.HideOn;
import gwt.material.design.client.constants.ShowOn;
import gwt.material.design.client.base.mixin.ColorsMixin;
import gwt.material.design.client.base.mixin.EnabledMixin;
import gwt.material.design.client.base.mixin.FocusableMixin;
import gwt.material.design.client.base.mixin.GridMixin;
import gwt.material.design.client.base.mixin.IdMixin;
import gwt.material.design.client.base.mixin.ScrollspyMixin;
import gwt.material.design.client.base.mixin.SeparatorMixin;
import gwt.material.design.client.base.mixin.ShadowMixin;
import gwt.material.design.client.base.mixin.CssNameMixin;

public class ComplexWidget extends ComplexPanel implements HasId, HasEnabled, HasTextAlign, HasColors, HasGrid,
        HasShadow, Focusable, HasInlineStyle, HasSeparator, HasScrollspy, HasHideOn, HasShowOn, HasCenterOn {

    private final IdMixin<ComplexWidget> idMixin = new IdMixin<>(this);
    private final EnabledMixin<ComplexWidget> enabledMixin = new EnabledMixin<>(this);
    private final CssNameMixin<ComplexWidget, TextAlign> textAlignMixin = new CssNameMixin<>(this);
    private final ColorsMixin<ComplexWidget> colorsMixin = new ColorsMixin<>(this);
    private final FocusableMixin<ComplexWidget> focusableMixin = new FocusableMixin<>(this);
    private final GridMixin<ComplexWidget> gridMixin = new GridMixin<>(this);
    private final ShadowMixin<ComplexWidget> shadowMixin = new ShadowMixin<>(this);
    private final SeparatorMixin<ComplexWidget> separatorMixin = new SeparatorMixin<>(this);
    private final ScrollspyMixin<ComplexWidget> scrollspyMixin = new ScrollspyMixin<>(this);
    private final CssNameMixin<ComplexWidget, HideOn> hideOnMixin = new CssNameMixin<>(this);
    private final CssNameMixin<ComplexWidget, ShowOn> showOnMixin = new CssNameMixin<>(this);
    private final CssNameMixin<ComplexWidget, CenterOn> centerOnMixin = new CssNameMixin<>(this);
    private final FontSizeMixin<ComplexWidget> fontSizeMixin = new FontSizeMixin<>(this);

    public ComplexWidget() {
    }

    public ComplexWidget(Element element) {
        setElement(element);
    }

    @Override
    public void add(final Widget child) {
        add(child, (Element) getElement());
    }

    /**
     * Inserts a widget at a specific index
     *
     * @param child       - widget to be inserted
     * @param beforeIndex - index for the widget
     */
    public void insert(final Widget child, final int beforeIndex) {
        insert(child, (Element) getElement(), beforeIndex, true);
    }

    @Override
    public void setId(String id) {
        idMixin.setId(id);
    }

    @Override
    public String getId() {
        return idMixin.getId();
    }

    @Override
    public boolean isEnabled() {
        return enabledMixin.isEnabled();
    }

    @Override
    public void setEnabled(boolean enabled) {
        enabledMixin.setEnabled(enabled);
    }

    @Override
    public TextAlign getTextAlign() {
        return textAlignMixin.getCssName();
    }

    @Override
    public void setTextAlign(TextAlign align) {
        textAlignMixin.setCssName(align);
    }

    @Override
    public void setBackgroundColor(String bgColor) {
        colorsMixin.setBackgroundColor(bgColor);
    }

    @Override
    public String getBackgroundColor() {
        return colorsMixin.getBackgroundColor();
    }

    @Override
    public void setTextColor(String textColor) {
        colorsMixin.setTextColor(textColor + "-text");
    }

    @Override
    public String getTextColor() {
        return colorsMixin.getTextColor();
    }

    @Override
    public int getTabIndex() {
        return focusableMixin.getTabIndex();
    }

    @Override
    public void setAccessKey(char key) {
        focusableMixin.setAccessKey(key);
    }

    @Override
    public void setFocus(boolean focused) {
        focusableMixin.setFocus(focused);
    }

    @Override
    public void setTabIndex(int index) {
        focusableMixin.setTabIndex(index);
    }

    @Override
    public void setGrid(String grid) {
        gridMixin.setGrid(grid);
    }

    @Override
    public void setOffset(String offset) {
        gridMixin.setOffset(offset);
    }

    @Override
    public void setShadow(int shadow) {
        shadowMixin.setShadow(shadow);
    }

    @Override
    public int getShadow() {
        return shadowMixin.getShadow();
    }

    @Override
    public void setMargin(double margin) {
        getElement().getStyle().setMargin(margin, Style.Unit.PX);
    }

    @Override
    public void setMarginTop(final double margin) {
        getElement().getStyle().setMarginTop(margin, Style.Unit.PX);
    }

    @Override
    public void setMarginLeft(final double margin) {
        getElement().getStyle().setMarginLeft(margin, Style.Unit.PX);
    }

    @Override
    public void setMarginRight(final double margin) {
        getElement().getStyle().setMarginRight(margin, Style.Unit.PX);
    }

    @Override
    public void setMarginBottom(final double margin) {
        getElement().getStyle().setMarginBottom(margin, Style.Unit.PX);
    }

    @Override
    public void setPadding(double padding) {
        getElement().getStyle().setPadding(padding, Style.Unit.PX);
    }

    @Override
    public void setPaddingTop(final double padding) {
        getElement().getStyle().setPaddingTop(padding, Style.Unit.PX);
    }

    @Override
    public void setPaddingLeft(final double padding) {
        getElement().getStyle().setPaddingLeft(padding, Style.Unit.PX);
    }

    @Override
    public void setPaddingRight(final double padding) {
        getElement().getStyle().setPaddingRight(padding, Style.Unit.PX);
    }

    @Override
    public void setPaddingBottom(final double padding) {
        getElement().getStyle().setPaddingBottom(padding, Style.Unit.PX);
    }

    @Override
    public void setOpacity(double opacity) {
        getElement().getStyle().setOpacity(opacity);
    }

    @Override
    public double getOpacity() {
        return Double.parseDouble(getElement().getStyle().getOpacity());
    }

    @Override
    public void setSeparator(boolean separator) {
        separatorMixin.setSeparator(separator);
    }

    @Override
    public boolean isSeparator() {
        return separatorMixin.isSeparator();
    }

    @Override
    public void setScrollspy(String scrollspy) {
        scrollspyMixin.setScrollspy(scrollspy);
    }

    @Override
    public String getScrollspy() {
        return scrollspyMixin.getScrollspy();
    }

    @Override
    public void setCenterOn(CenterOn centerOn) {
        centerOnMixin.setCssName(centerOn);
    }

    @Override
    public CenterOn getCenterOn() {
        return centerOnMixin.getCssName();
    }

    @Override
    public void setHideOn(HideOn hideOn) {
        hideOnMixin.setCssName(hideOn);
    }

    @Override
    public HideOn getHideOn() {
        return hideOnMixin.getCssName();
    }

    @Override
    public void setShowOn(ShowOn showOn) {
        showOnMixin.setCssName(showOn);
    }

    @Override
    public ShowOn getShowOn() {
        return showOnMixin.getCssName();
    }

    @Override
    public void setFontSize(String fontSize) {
        fontSizeMixin.setFontSize(fontSize);
    }

    @Override
    public String getFontSize() {
        return fontSizeMixin.getFontSize();
    }

    @Override
    public void setFontSize(double fontSize, Style.Unit unit) {
        fontSizeMixin.setFontSize(fontSize, unit);
    }
}
