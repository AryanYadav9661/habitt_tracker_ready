import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';

void main() {
  testWidgets('App loads and shows home screen', (WidgetTester tester) async {
    await tester.pumpWidget(const HabitTrackerApp() as Widget);
    await tester.pumpAndSettle();

    // Verify your AppBar title
    expect(find.text('Habit Tracker'), findsOneWidget);

    // Verify the Add-FAB is present
    expect(find.byType(FloatingActionButton), findsOneWidget);
    expect(find.byIcon(Icons.add), findsOneWidget);
  });
}

class HabitTrackerApp {
  const HabitTrackerApp();
}
