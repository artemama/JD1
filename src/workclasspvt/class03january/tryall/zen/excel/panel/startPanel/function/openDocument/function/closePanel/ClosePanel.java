package workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.closePanel;


import workclasspvt.class03january.tryall.zen.excel.language.Language;
import workclasspvt.class03january.tryall.zen.excel.panel.IExecute;

public class ClosePanel implements IExecute {

	@Override
	public void execute() throws RuntimeException {
		throw new RuntimeException(Language.getLocalString("documentclosed"));
	}

}
