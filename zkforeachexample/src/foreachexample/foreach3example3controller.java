package foreachexample;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;

public class foreach3example3controller extends SelectorComposer<Listbox> {
//private Static final long serialVersionUID = ;
	@Override
	public void doAfterCompose(Listbox comp) throws Exception {
		super.doAfterCompose(comp);
		ListModelList<String>listModel =new ListModelList<String>();
		listModel.add("Desktop");
		listModel.add("Laptop");
		listModel.add("Mobile");
		comp.setModel(listModel);
		
	}
}
