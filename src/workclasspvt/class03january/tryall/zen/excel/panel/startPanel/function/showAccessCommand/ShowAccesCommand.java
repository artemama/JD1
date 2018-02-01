package workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.showAccessCommand;

import workclasspvt.class03january.tryall.zen.excel.language.Language;
import workclasspvt.class03january.tryall.zen.excel.panel.IExecute;

public class ShowAccesCommand implements IExecute{
    @Override
	public void execute() {
    	Language.showMessage("startPanel1");
    	Language.showMessage("startPanel2");
    	Language.showMessage("startPanel3");
    	Language.showMessage("startPanel4");
    	Language.showMessage("startPanel5");
    	Language.showMessage("startPanel6");
	}
}
