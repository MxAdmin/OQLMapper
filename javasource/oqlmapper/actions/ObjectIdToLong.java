// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package oqlmapper.actions;

import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Sometimes you need to constraint the data based on associations and you need to do that on the ID of a persistent object.
 * This function will return the ID as a Long of the InputObject.
 */
public class ObjectIdToLong extends CustomJavaAction<Long>
{
	private IMendixObject InputObject;

	public ObjectIdToLong(IContext context, IMendixObject InputObject)
	{
		super(context);
		this.InputObject = InputObject;
	}

	@Override
	public Long executeAction() throws Exception
	{
		// BEGIN USER CODE
		if(this.InputObject != null)
			return this.InputObject.getId().toLong();
		else
			throw new CoreException("The requested parameter 'InputObject' is empty!");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "ObjectIdToLong";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
