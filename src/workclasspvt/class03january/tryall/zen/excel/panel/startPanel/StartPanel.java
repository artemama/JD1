package workclasspvt.class03january.tryall.zen.excel.panel.startPanel;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import workclasspvt.class03january.tryall.zen.excel.document.Document;
import workclasspvt.class03january.tryall.zen.excel.panel.CommandExecutor;
import workclasspvt.class03january.tryall.zen.excel.panel.IExecute;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.closePanel.ClosePanel;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.createDocument.CreateDocument;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.deleteDocument.DeleteDocument;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.loadListDocument.LoadListDocument;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.OpenPanel;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.saveFile.SaveFile;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.showAccessCommand.ShowAccesCommand;

public class StartPanel {
	private static List<Document> listDocument = new LinkedList();
	private static Map<String, IExecute> mapCommand = new HashMap<String, IExecute>();

	
	public static void start() {		
		listDocument = LoadListDocument.getList();
		mapCommand.put("-h", new ShowAccesCommand());
		mapCommand.put("-create", new CreateDocument(listDocument));
		mapCommand.put("-delete", new DeleteDocument(listDocument));
		mapCommand.put("-save", new SaveFile(listDocument));
		mapCommand.put("-end", new ClosePanel());
		mapCommand.put("-open", new OpenPanel(listDocument));
		new ShowAccesCommand().execute();
		
		
		
		
		CommandExecutor.execute(mapCommand);

	}

}
