package workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.closePanel;

import workclasspvt.class03january.tryall.zen.excel.panel.IExecute;

public class ClosePanel implements IExecute {

	@Override
	public void execute() throws RuntimeException {
		throw new RuntimeException("Document closed");
	}

}
