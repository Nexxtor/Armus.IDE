package armus.ide.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;


public class DemoCustomTab extends JPanel {
	IDE_Armus customJTabbedPane;

	/** JPanel contiene un JLabel y un JButton para cerrar.
         *  @param customJTabbedPane */
	public DemoCustomTab(IDE_Armus customJTabbedPane) {
		this.customJTabbedPane = customJTabbedPane;
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBorder(new EmptyBorder(5, 2, 2, 2));
		setOpaque(false);
		addLabel();
		add(new CustomButton("x"));
	}

	private void addLabel() {
		JLabel label = new JLabel() {
			/* establece el texto del JLabel, el titulo del tab */
                        @Override
			public String getText() {
				int index = customJTabbedPane.jTabbedPane1.indexOfTabComponent(DemoCustomTab.this);
				if (index != -1) {
					return customJTabbedPane.jTabbedPane1.getTitleAt(index);
				}
				return null;
			}
		};
		/* agregar mas espacio entre el label y el boton */
		label.setBorder(new EmptyBorder(0, 0, 0, 10));
		add(label);
	}

	class CustomButton extends JButton implements MouseListener {
		public CustomButton(String text) {
			int size = 15;
			setText(text);
			/** establece el tamano del boton cerrar */
			setPreferredSize(new Dimension(size, size));
			setToolTipText("Cierra la pestaña");
			/** establecer transparente */
			setContentAreaFilled(false);
			/** establece el borde para el boton */
			setBorder(new EtchedBorder());
			/** no muestra el borde */
			setBorderPainted(false);
			setFocusable(false);
			/** agrega el evento con el mouse */
			addMouseListener(this);
		}

		/** cuando se hace clic al boton, la pestania se cierra */
		@Override
		public void mouseClicked(MouseEvent e) {
			int index = customJTabbedPane.jTabbedPane1.indexOfTabComponent(DemoCustomTab.this);
			if (index != -1) {
				customJTabbedPane.removePestania(index);
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		/** muestra el borde del boton cuando el mouse pasa */
		@Override
		public void mouseEntered(MouseEvent e) {
			setBorderPainted(true);
			setForeground(Color.RED);
		}

		/** mantiene el borde cuando el mouse pasa */
		@Override
		public void mouseExited(MouseEvent e) {
			setBorderPainted(false);
			setForeground(Color.BLACK);
		}
	}
}