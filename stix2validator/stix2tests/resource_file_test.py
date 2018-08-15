import unittest
import warnings
import logging
from stix2validator import validate_file, print_results, ValidationOptions
from pathlib import Path


class ResourceFileTest(unittest.TestCase):

    def setUp(self):
        self.validation_options = ValidationOptions(strict=True)
        self.pathlist = Path("../../stix2gson/src/test/resources").glob('**/*.json')

    def test_resource_files(self):
        for path in self.pathlist:
            results = validate_file(str(path), self.validation_options)
            with self.subTest(str(path)):
                print_results([results])
                self.assertTrue(results.is_valid)
