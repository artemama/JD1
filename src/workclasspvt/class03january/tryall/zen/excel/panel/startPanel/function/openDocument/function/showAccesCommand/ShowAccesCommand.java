package workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.showAccesCommand;

import workclasspvt.class03january.tryall.zen.excel.language.Language;
import workclasspvt.class03january.tryall.zen.excel.panel.IExecute;

public class ShowAccesCommand implements IExecute {

	@Override
	public void execute() {
		Language.showMessage("openPanel1");
		Language.showMessage("openPanel2");
		Language.showMessage("openPanel3");

	}

}
