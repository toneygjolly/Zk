package foreachexample;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;

public class foreach4example4controller extends SelectorComposer<Listbox>{
	@Override
	public void doAfterCompose(Listbox comp) throws Exception {
		super.doAfterCompose(comp);
		ListModelList<carpojo>listModel=new ListModelList();
		listModel.add(new carpojo("M111","tata"));
		listModel.add(new carpojo("A111","Honda"));
		comp.setModel(listModel);
		
	}

}
