import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:habitt_tracker/main.dart'; // matches your pubspec name

void main() {
  testWidgets('App loads and shows home screen', (WidgetTester tester) async {
    await tester.pumpWidget(const HabitTrackerApp());
    await tester.pumpAndSettle();

    // Verify your AppBar title
    expect(find.text('Habit Tracker'), findsOneWidget);

    // Verify the Add-FAB is present
    expect(find.byType(FloatingActionButton), findsOneWidget);
    expect(find.byIcon(Icons.add), findsOneWidget);
  });
}
