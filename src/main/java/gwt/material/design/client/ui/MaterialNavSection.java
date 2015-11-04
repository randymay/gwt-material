package gwt.material.design.client.ui;

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

import gwt.material.design.client.base.HasPosition;
import gwt.material.design.client.constants.Position;
import gwt.material.design.client.ui.html.ListItem;
import gwt.material.design.client.ui.html.UnorderedList;

import com.google.gwt.user.client.ui.Widget;

//@formatter:off
/**
* 
* <p>Material NavSection is a child of MaterialNavBar that will contain toolbar items such as link, icon and other components
* <h3>UiBinder Usage:</h3>
* 
* <pre>
* {@code 
<m:MaterialNavSection align="right">
	<m:MaterialLink  icon="mdi-action-account-circle" iconPosition="left" text="Account"  textColor="white" waves="light"/>
	<m:MaterialLink  icon="mdi-action-autorenew" iconPosition="left" text="Refresh" textColor="white" waves="light"/>
	<m:MaterialLink  icon="mdi-action-search" tooltip="Menu" textColor="white" waves="light"/>
	<m:MaterialLink  icon="mdi-navigation-more-vert" tooltip="Starter" textColor="white" waves="light"/>
</m:MaterialNavSection>
}
</pre>
* </p>
* 
* @author kevzlou7979
* @see <a href="http://gwt-material-demo.herokuapp.com/#loaders">Material Loaders</a>
*/
//@formatter:on
public class MaterialNavSection extends UnorderedList implements HasPosition{

	private Position position;

	/**
	 * Container for App Toolbar and App Sidebar , contains Material
	 * Links, Icons or any other material components.
	 */
	public MaterialNavSection() {
		super();
		setStyleName("hide-on-med-and-down");
	}
	
	

	@Override
	public void add(Widget child) {
		// TODO Auto-generated method stub
		super.add(new ListItem(child));
	}



	@Override
	public Position getPosition() {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public void setPosition(Position position) {
		this.position = position;
		addStyleName(position.getCssName());
	}
}
