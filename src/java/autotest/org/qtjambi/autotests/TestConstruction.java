/****************************************************************************
**
** Copyright (C) 1992-2009 Nokia. All rights reserved.
**
** This file is part of Qt Jambi.
**
** ** $BEGIN_LICENSE$
** Commercial Usage
** Licensees holding valid Qt Commercial licenses may use this file in
** accordance with the Qt Commercial License Agreement provided with the
** Software or, alternatively, in accordance with the terms contained in
** a written agreement between you and Nokia.
** 
** GNU Lesser General Public License Usage
** Alternatively, this file may be used under the terms of the GNU Lesser
** General Public License version 2.1 as published by the Free Software
** Foundation and appearing in the file LICENSE.LGPL included in the
** packaging of this file.  Please review the following information to
** ensure the GNU Lesser General Public License version 2.1 requirements
** will be met: http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html.
** 
** In addition, as a special exception, Nokia gives you certain
** additional rights. These rights are described in the Nokia Qt LGPL
** Exception version 1.0, included in the file LGPL_EXCEPTION.txt in this
** package.
** 
** GNU General Public License Usage
** Alternatively, this file may be used under the terms of the GNU
** General Public License version 3.0 as published by the Free Software
** Foundation and appearing in the file LICENSE.GPL included in the
** packaging of this file.  Please review the following information to
** ensure the GNU General Public License version 3.0 requirements will be
** met: http://www.gnu.org/copyleft/gpl.html.
** 
** If you are unsure which license is appropriate for your use, please
** contact the sales department at qt-sales@nokia.com.
** $END_LICENSE$

**
** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
**
****************************************************************************/

package org.qtjambi.autotests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.qtjambi.qt.core.QEvent;
import org.qtjambi.qt.core.QObject;
import org.qtjambi.qt.widgets.QMdiArea;
import org.qtjambi.qt.widgets.QMdiSubWindow;
import org.qtjambi.qt.widgets.QWidget;

public class TestConstruction extends QApplicationTest {
    @Test
    public void testQObjectConversionInConstructor() {
        QMdiArea area = new QMdiArea() {
            @Override
            public boolean eventFilter(QObject o, QEvent e) {
                return false;
            }
        };
        area.show();

        QMdiSubWindow subWindow = area.addSubWindow(new QWidget());

        // Although it seems unlikely, this may actually be false, trust me.
        assertTrue(subWindow instanceof QMdiSubWindow);
    }

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main(TestConstruction.class.getName());
    }
}
